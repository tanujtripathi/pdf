package com.intel.pdf.restControllers;

import com.intel.pdf.model.Health;
import com.intel.pdf.model.Pdf;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class PdfRestController {

    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "c://temp//rr//";

    @GetMapping("/health")
    @CrossOrigin("null")
    public Health healthCheck() {
        return new Health ( "Service is up and running" );
    }

    /**
     * pdf will be saved in
     * the provided location
     */
    @PostMapping("/savePdf")
   // @CrossOrigin("null")
    public Pdf savePdfToFileDirectory(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty ( )) {
            return new Pdf ( "No file is selected" );
        }

        try {
            byte[] bytes = file.getBytes ( );
            Path path = Paths.get ( UPLOADED_FOLDER + file.getOriginalFilename ( ) );
            Files.write ( path, bytes );
            String response = "Your file is successfully uploaded '" + file.getOriginalFilename ( ) + "'";
            Pdf pdf = new Pdf ( response );
            return pdf;
        } catch (IOException e) {
            e.printStackTrace ( );
            return new Pdf ( e.getMessage ( ) );
        }
    }

    /**
     * @param location is a dynamic location
     *                 passed along with the
     *                 request
     *                 <p>
     *                 10.0.0.0/savePdf/c://location
     */
    @PostMapping("/savePdf/{location}")
    public void savePdfToFileDirectoryToLocation(@PathVariable("location") String location) {
        // TODO write logic
    }
}
