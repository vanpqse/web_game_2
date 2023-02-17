//package swd.game.web_game.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.IOException;
//
//import org.springframework.web.bind.annotation.RequestParam;
//
//import org.springframework.web.multipart.MultipartFile;
//
//import org.springframework.http.HttpStatus;
//
//import org.springframework.web.bind.annotation.*;
//
//import swd.game.web_game.service.fileUpload.FirebaseStorageService;
//
//@RestController
//@RequestMapping("/api/files")
//public class FileUploadController {
//
//    @Autowired
//    private FirebaseStorageService storageService;
//
//    @PostMapping
//    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
//        String url = storageService.uploadFile(file);
//        return new ResponseEntity<>(url, HttpStatus.OK);
//    }
//}
//
