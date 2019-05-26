package co.uk.test.json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExplorerJsonTest {

    private JSONObject jsonObj;

    private void setUpGivenJsonData() {
        jsonObj = new JSONObject("{\n" +
                "  \"MRData\": {\n" +
                "    \"xmlns\": \"http://ergast.com/mrd/1.4\",\n" +
                "    \"total\": \"21\",\n" +
                "    \"offset\": \"0\",\n" +
                "    \"series\": \"f1\",\n" +
                "    \"limit\": \"30\",\n" +
                "    \"CircuitTable\": {\n" +
                "      \"Circuits\": [\n" +
                "        {\n" +
                "          \"circuitId\": \"albert_park\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Melbourne_Grand_Prix_Circuit\",\n" +
                "          \"circuitName\": \"Albert Park Grand Prix Circuit\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Australia\",\n" +
                "            \"locality\": \"Melbourne\",\n" +
                "            \"lat\": \"-37.8497\",\n" +
                "            \"long\": \"144.968\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"americas\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Circuit_of_the_Americas\",\n" +
                "          \"circuitName\": \"Circuit of the Americas\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"USA\",\n" +
                "            \"locality\": \"Austin\",\n" +
                "            \"lat\": \"30.1328\",\n" +
                "            \"long\": \"-97.6411\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"bahrain\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Bahrain_International_Circuit\",\n" +
                "          \"circuitName\": \"Bahrain International Circuit\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Bahrain\",\n" +
                "            \"locality\": \"Sakhir\",\n" +
                "            \"lat\": \"26.0325\",\n" +
                "            \"long\": \"50.5106\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"BAK\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Baku_City_Circuit\",\n" +
                "          \"circuitName\": \"Baku City Circuit\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Azerbaijan\",\n" +
                "            \"locality\": \"Baku\",\n" +
                "            \"lat\": \"100\",\n" +
                "            \"long\": \"49.8533\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"catalunya\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Circuit_de_Barcelona-Catalunya\",\n" +
                "          \"circuitName\": \"Circuit de Barcelona-Catalunya\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Spain\",\n" +
                "            \"locality\": \"Montmeló\",\n" +
                "            \"lat\": \"41.57\",\n" +
                "            \"long\": \"2.26111\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"hockenheimring\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Hockenheimring\",\n" +
                "          \"circuitName\": \"Hockenheimring\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Germany\",\n" +
                "            \"locality\": \"Hockenheim\",\n" +
                "            \"lat\": \"49.3278\",\n" +
                "            \"long\": \"8.56583\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"hungaroring\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Hungaroring\",\n" +
                "          \"circuitName\": \"Hungaroring\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Hungary\",\n" +
                "            \"locality\": \"Budapest\",\n" +
                "            \"lat\": \"100\",\n" +
                "            \"long\": \"19.2486\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"interlagos\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Aut%C3%B3dromo_Jos%C3%A9_Carlos_Pace\",\n" +
                "          \"circuitName\": \"Autódromo José Carlos Pace\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Brazil\",\n" +
                "            \"locality\": \"São Paulo\",\n" +
                "            \"lat\": \"-23.7036\",\n" +
                "            \"long\": \"-46.6997\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"marina_bay\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Marina_Bay_Street_Circuit\",\n" +
                "          \"circuitName\": \"Marina Bay Street Circuit\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Singapore\",\n" +
                "            \"locality\": \"Marina Bay\",\n" +
                "            \"lat\": \"100\",\n" +
                "            \"long\": \"103.864\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"monaco\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Circuit_de_Monaco\",\n" +
                "          \"circuitName\": \"Circuit de Monaco\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Monaco\",\n" +
                "            \"locality\": \"Monte-Carlo\",\n" +
                "            \"lat\": \"43.7347\",\n" +
                "            \"long\": \"7.42056\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"monza\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Autodromo_Nazionale_Monza\",\n" +
                "          \"circuitName\": \"Autodromo Nazionale di Monza\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Italy\",\n" +
                "            \"locality\": \"Monza\",\n" +
                "            \"lat\": \"45.6156\",\n" +
                "            \"long\": \"9.28111\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"red_bull_ring\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Red_Bull_Ring\",\n" +
                "          \"circuitName\": \"Red Bull Ring\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Austria\",\n" +
                "            \"locality\": \"Spielburg\",\n" +
                "            \"lat\": \"47.2197\",\n" +
                "            \"long\": \"14.7647\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"ricard\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Paul_Ricard_Circuit\",\n" +
                "          \"circuitName\": \"Circuit Paul Ricard\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"France\",\n" +
                "            \"locality\": \"Le Castellet\",\n" +
                "            \"lat\": \"100\",\n" +
                "            \"long\": \"5.79167\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"rodriguez\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Aut%C3%B3dromo_Hermanos_Rodr%C3%ADguez\",\n" +
                "          \"circuitName\": \"Autódromo Hermanos Rodríguez\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Mexico\",\n" +
                "            \"locality\": \"Mexico City\",\n" +
                "            \"lat\": \"19.4042\",\n" +
                "            \"long\": \"-99.0907\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"shanghai\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Shanghai_International_Circuit\",\n" +
                "          \"circuitName\": \"Shanghai International Circuit\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"China\",\n" +
                "            \"locality\": \"Shanghai\",\n" +
                "            \"lat\": \"31.3389\",\n" +
                "            \"long\": \"121.22\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"silverstone\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Silverstone_Circuit\",\n" +
                "          \"circuitName\": \"Silverstone Circuit\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"UK\",\n" +
                "            \"locality\": \"Silverstone\",\n" +
                "            \"lat\": \"52.0786\",\n" +
                "            \"long\": \"-1.01694\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"sochi\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Sochi_Autodrom\",\n" +
                "          \"circuitName\": \"Sochi Autodrom\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Russia\",\n" +
                "            \"locality\": \"Sochi\",\n" +
                "            \"lat\": \"43.4057\",\n" +
                "            \"long\": \"39.9578\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"spa\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Circuit_de_Spa-Francorchamps\",\n" +
                "          \"circuitName\": \"Circuit de Spa-Francorchamps\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Belgium\",\n" +
                "            \"locality\": \"Spa\",\n" +
                "            \"lat\": \"50.4372\",\n" +
                "            \"long\": \"5.97139\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"suzuka\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Suzuka_Circuit\",\n" +
                "          \"circuitName\": \"Suzuka Circuit\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Japan\",\n" +
                "            \"locality\": \"Suzuka\",\n" +
                "            \"lat\": \"34.8431\",\n" +
                "            \"long\": \"136.541\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"villeneuve\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Circuit_Gilles_Villeneuve\",\n" +
                "          \"circuitName\": \"Circuit Gilles Villeneuve\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"Canada\",\n" +
                "            \"locality\": \"Montreal\",\n" +
                "            \"lat\": \"45.5\",\n" +
                "            \"long\": \"-73.5228\"\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"circuitId\": \"yas_marina\",\n" +
                "          \"url\": \"http://en.wikipedia.org/wiki/Yas_Marina_Circuit\",\n" +
                "          \"circuitName\": \"Yas Marina Circuit\",\n" +
                "          \"Location\": {\n" +
                "            \"country\": \"UAE\",\n" +
                "            \"locality\": \"Abu Dhabi\",\n" +
                "            \"lat\": \"24.4672\",\n" +
                "            \"long\": \"54.6031\"\n" +
                "          }\n" +
                "        }\n" +
                "      ],\n" +
                "      \"season\": \"2018\"\n" +
                "    },\n" +
                "    \"url\": \"http://ergast.com/api/f1/2018/circuits.json\"\n" +
                "  }\n" +
                "}");
    }

    @Test
    public void shouldGetSeasonDateAs2018WithGivenJsonData() {

        //given
        setUpGivenJsonData();

        //when
        String actualSeasonValue = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getString("season");

        assertEquals("2018", actualSeasonValue);
        //Then
    }

    @Test
    public void shouldReturn20AsTotalNumberOfCircuits() {

        // given
        setUpGivenJsonData();
        //when
        JSONArray actualNumberOfCircuits = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray("Circuits");
        //then
        assertEquals(21, actualNumberOfCircuits.length());

        assertThat(21, is(actualNumberOfCircuits.length()));
    }

    @Test
    public void shouldReturnAustraliaAsMyCountry() {

        //given
        setUpGivenJsonData();

        //when
        // JSONArray countryName = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray("Circuits");

        String countryName = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray("Circuits").getJSONObject(0).getJSONObject("Location").getString("country");

        assertEquals("Australia", countryName);
    }

    @Test

    public void shouldReturnLatitudeCountAs3ForTheLatitudeValue100() {

        //given
        setUpGivenJsonData();
        //when
        String countryName = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray("Circuits").getJSONObject(0).getJSONObject("Location").getString("lat");
        //then
        JSONArray actualNumberOfCircuits = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray("Circuits");


        for (int i = 0; i <= actualNumberOfCircuits.length() - 1; i++) {


            // System.out.println(i);

            String j = jsonObj.getJSONObject("MRData").getJSONObject("CircuitTable").getJSONArray("Circuits").getJSONObject(i).getJSONObject("Location").getString("lat");
            System.out.println(j);

            int result = Integer.parseInt(j);
            if (result == 100) {
                System.out.println("valid");
            }
           // Integer result = Integer.valueOf(j);
            //if (result == 100)

              //  assertEquals(3, j);

        }

    }

}






