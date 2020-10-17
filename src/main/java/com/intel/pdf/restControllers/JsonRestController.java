package com.intel.pdf.restControllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intel.pdf.model.TableJson;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@RestController
public class JsonRestController {

    @GetMapping("/getJson")
    @CrossOrigin
    public String getJsonValues() throws IOException {

        File jsonFile = new File ( "data.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( jsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( json );
        return s;
    }

    @PostMapping("/postJson")
    @CrossOrigin
    public String postJsonValues(@RequestBody String receivedJson) throws IOException {
        Map<String, String> jsonToMap = new ObjectMapper ( ).readValue ( receivedJson, Map.class );
        System.out.println ( jsonToMap );

        File jsonFile = new File ( "data.json" );
        if (jsonFile.exists ()){
            System.out.println ("true" );
        }

        // Updated Json File
        new ObjectMapper ( ).writeValue ( new File ( "data.json" ), jsonToMap );

        File updatedJsonFile = new File ( "data.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( updatedJsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( updatedJsonFile );
        return s;

    }

    @GetMapping("/getDrawlatJson")
    @CrossOrigin
    public String getJsonDrawlatValues() throws IOException {

        File jsonFile = new File ( "data_drawlat.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( jsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( json );
        return s;
    }
    @PostMapping("/postDrawlatJson")
    @CrossOrigin
    public String postJsonDrawlatValues(@RequestBody String receivedJson) throws IOException {
        Map<String, String> jsonToMap = new ObjectMapper ( ).readValue ( receivedJson, Map.class );
        System.out.println ( jsonToMap );

        File jsonFile = new File ( "data_drawlat.json" );
        if (jsonFile.exists ()){
            System.out.println ("true" );
        }

        // Updated Json File
        new ObjectMapper ( ).writeValue ( new File ( "data_drawlat.json" ), jsonToMap );

        File updatedJsonFile = new File ( "data_drawlat.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( updatedJsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( updatedJsonFile );
        return s;

    }

    @GetMapping("/getWaddleDooJson")
    @CrossOrigin
    public String getJsonWaddleDooValues() throws IOException {

        File jsonFile = new File ( "data_waddledoo.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( jsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( json );
        return s;
    }
    @PostMapping("/postWaddleDooJson")
    @CrossOrigin
    public String postJsonWaddleDooValues(@RequestBody String receivedJson) throws IOException {
        Map<String, String> jsonToMap = new ObjectMapper ( ).readValue ( receivedJson, Map.class );
        System.out.println ( jsonToMap );

        File jsonFile = new File ( "data_waddledoo.json" );
        if (jsonFile.exists ()){
            System.out.println ("true" );
        }

        // Updated Json File
        new ObjectMapper ( ).writeValue ( new File ( "data_waddledoo.json" ), jsonToMap );

        File updatedJsonFile = new File ( "data_waddledoo.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( updatedJsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( updatedJsonFile );
        return s;

    }

    @GetMapping("/getWaddleDeeJson")
    @CrossOrigin
    public String getJsonWaddleDeeValues() throws IOException {

        File jsonFile = new File ( "data_waddledee.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( jsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( json );
        return s;
    }
    @PostMapping("/postWaddleDeeJson")
    @CrossOrigin
    public String postJsonWaddleDeeValues(@RequestBody String receivedJson) throws IOException {
        Map<String, String> jsonToMap = new ObjectMapper ( ).readValue ( receivedJson, Map.class );
        System.out.println ( jsonToMap );

        File jsonFile = new File ( "data_waddledee.json" );
        if (jsonFile.exists ()){
            System.out.println ("true" );
        }

        // Updated Json File
        new ObjectMapper ( ).writeValue ( new File ( "data_waddledee.json" ), jsonToMap );

        File updatedJsonFile = new File ( "data_waddledee.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( updatedJsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( updatedJsonFile );
        return s;

    }

    @GetMapping("/getVolteerJson")
    @CrossOrigin
    public String getJsonVolteerValues() throws IOException {

        File jsonFile = new File ( "data_tgl_volteer.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( jsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( json );
        return s;
    }
    @PostMapping("/postVolteerJson")
    @CrossOrigin
    public String postJsonVolteerValues(@RequestBody String receivedJson) throws IOException {
        Map<String, String> jsonToMap = new ObjectMapper ( ).readValue ( receivedJson, Map.class );
        System.out.println ( jsonToMap );

        File jsonFile = new File ( "data_tgl_volteer.json" );
        if (jsonFile.exists ()){
            System.out.println ("true" );
        }

        // Updated Json File
        new ObjectMapper ( ).writeValue ( new File ( "data_tgl_volteer.json" ), jsonToMap );

        File updatedJsonFile = new File ( "data_tgl_volteer.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( updatedJsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( updatedJsonFile );
        return s;

    }

    @GetMapping("/getDelbinJson")
    @CrossOrigin
    public String getJsonDelbinValues() throws IOException {

        File jsonFile = new File ( "data_tgl_delbin.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( jsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( json );
        return s;
    }
    @PostMapping("/postDelbinJson")
    @CrossOrigin
    public String postJsondelbinValues(@RequestBody String receivedJson) throws IOException {
        Map<String, String> jsonToMap = new ObjectMapper ( ).readValue ( receivedJson, Map.class );
        System.out.println ( jsonToMap );

        File jsonFile = new File ( "data_tgl_delbin.json" );
        if (jsonFile.exists ()){
            System.out.println ("true" );
        }

        // Updated Json File
        new ObjectMapper ( ).writeValue ( new File ( "data_tgl_delbin.json" ), jsonToMap );

        File updatedJsonFile = new File ( "data_tgl_delbin.json" );

        Map<String, String> json = null;
        try {
            json = new ObjectMapper ( ).readValue ( updatedJsonFile, Map.class );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        String s = new ObjectMapper ( ).writeValueAsString ( updatedJsonFile );
        return s;

    }
    public static void main(String[] args) throws IOException {

            String receivedJson = "{\n" +
                    "  \"name\": \"tanuj\",\n" +
                    "  \"roll\": \"3\"\n" +
                    "}";

        Map<String, String> jsonToMap = new ObjectMapper ( ).readValue ( receivedJson, Map.class );
        System.out.println ( jsonToMap );

        File jsonFile = new File ( "a.json" );
        if (jsonFile.exists ()){
            System.out.println ("true" );
        }

        new ObjectMapper ( ).writeValue ( new File ( "a.json" ), jsonToMap );
    }
}

