package com.berkgokden.esservice;

import com.berkgokden.common.WeatherData;
import com.berkgokden.db.WeatherDataRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by developer on 7/30/16.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(EsserviceController.class)
public class EsserviceControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private WeatherDataRepository repository;

    @Before
    public void setup() {
        String location = "062250";
        String date = "2015-09-03";
        Long time = EsserviceController.convertDateToUnixTime(date);

        List<WeatherData> list = new ArrayList<>(1);
        list.add(new WeatherData(location+"|"+time));
        Page<WeatherData> response = new PageImpl<>(list);

        given(this.repository
                .search(any(SearchQuery.class))
        ).willReturn(response);
    }

    @Test
    public void shoudlPassWhenForecastEndpointReturnLocationMissingErrorMessage() throws Exception {
        String date = "2015-09-03";

        String expetedContent = "Required String parameter 'location' is not present";

        this.mvc.perform(get("/forecast")
                .param("forecastdate", date)
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isBadRequest())
                .andExpect(status().reason(expetedContent));
    }

    @Test
    public void shoudlPassWhenForecastEndpointReturnForecastdateMissingErrorMessage() throws Exception {
        String location = "062250";

        String expetedContent = "Required String parameter 'forecastdate' is not present";

        this.mvc.perform(get("/forecast")
                .param("location", location)
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isBadRequest())
                .andExpect(status().reason(expetedContent));
    }

    @Test
    public void shoudlPassWhenForecastEndpointReturnJsonObject() throws Exception {
        String location = "062250";
        String date = "2015-09-03";
        Long time = EsserviceController.convertDateToUnixTime(date);

        String expetedJson = "[{\"id\":\""+location+"|"+time+"\",\"project\":null,\"model\":null,\"location\":null,\"date\":null,\"time\":null,\"leadtime\":null,\"forecastdatetime\":null,\"ttt\":null,\"tx\":null,\"tn\":null,\"td\":null,\"pppp\":null,\"dd\":null,\"ff\":null,\"fx1\":null,\"fx3\":null,\"fx6\":null,\"mn\":null,\"sn\":null,\"n\":null,\"mneff\":null,\"sneff\":null,\"neff\":null,\"mnlm\":null,\"nlm\":null,\"nh\":null,\"nm\":null,\"mnl\":null,\"nl\":null,\"n230\":null,\"rh\":null,\"vv\":null,\"wwm\":null,\"wwm3\":null,\"wwm6\":null,\"wwp\":null,\"wwp3\":null,\"wwp6\":null,\"wwz\":null,\"wwd\":null,\"wwc\":null,\"wwt\":null,\"wwl\":null,\"wws\":null,\"wwf\":null,\"wwz3\":null,\"wwd3\":null,\"wwc3\":null,\"wwt3\":null,\"wwl3\":null,\"wwf3\":null,\"wws3\":null,\"wwz6\":null,\"wwd6\":null,\"wwc6\":null,\"wwt6\":null,\"wwl6\":null,\"wwf6\":null,\"wws6\":null,\"wwzh\":null,\"wwdh\":null,\"wwch\":null,\"wwth\":null,\"wwlh\":null,\"wwfh\":null,\"wwsh\":null,\"wwmh\":null,\"wwph\":null,\"drr1\":null,\"rr1\":null,\"rr6\":null,\"rrd\":null,\"sund1\":null,\"jsun1\":null,\"rsund\":null,\"rn2sd\":null,\"rad1h\":null,\"rrad1\":null,\"pvv10\":null,\"rrh\":null,\"d_t2m\":null,\"d_xt\":null,\"d_nt\":null,\"d_td\":null,\"dpppp\":null,\"ddd10\":null,\"dff10\":null,\"d_n\":null,\"d_ct3\":null,\"d_ct6\":null,\"ch\":null,\"cm\":null,\"cl\":null,\"d_rh\":null,\"sr3t\":null,\"sr6t\":null,\"tg\":null,\"px125\":null,\"px140\":null,\"px155\":null}]";

        this.mvc.perform(get("/forecast")
                .param("location", location)
                .param("forecastdate", date)
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().json(expetedJson))
                .andExpect(content().contentType("application/json;charset=UTF-8"));

    }

}