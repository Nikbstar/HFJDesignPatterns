package ru.nik66.weather.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public List<Float> getDatas() throws IOException {
        String url = "https://yandex.ru/pogoda/yekaterinburg";
        Document page = Jsoup.parse(new URL(url), 3000);
        Element weather = page.selectFirst("div[class='fact fact_size_m fact_with-hourly-prognosis']");
        Element temperature = weather.select("div[class='temp fact__temp fact__temp_size_s']").select("span[class='temp__value']").first();
        String temp = temperature.ownText();
        float t = (temp.contains("−")) ? -Float.parseFloat(temp.replace("−", "")) :  Float.parseFloat(temp);
        Element other = weather.selectFirst("div[class='fact__props fact__props_position_middle']");
        Element humidity = other.select("dl[class='term term_orient_v fact__humidity']").select("dd[class='term__value']").first();
        float h = Float.parseFloat(humidity.ownText().replace("%", ""));
        Element pressure = other.select("dl[class='term term_orient_v fact__pressure']").select("dd[class='term__value']").first();
        float p = Float.parseFloat(pressure.ownText());

        return Arrays.asList(t, h, p);
    }

}
