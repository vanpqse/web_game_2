//package swd.game.web_game.service.fileUpload;
//
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import org.springframework.stereotype.Service;
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.storage.*;
//
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.annotation.PostConstruct;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//@Service
//public class FirebaseStorageService {
//
//    private Storage storage;
//
//    @PostConstruct
//    public void init() throws IOException {
//        // Load the Firebase service account key
//        FileInputStream serviceAccount = new FileInputStream("serviceAccountKey.json");
//        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
//
//        // Initialize the Firebase app with the service account
//        FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(credentials)
//                .build();
//        FirebaseApp.initializeApp(options);
//
//        // Initialize the Cloud Storage client
//        storage = StorageOptions.getDefaultInstance().getService();
//    }
//
//    public String uploadFile(MultipartFile file) throws IOException {
//        // Generate a unique file name
//        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
//
//        // Upload the file to Cloud Storage
//        BlobInfo blobInfo = storage.create(
//                BlobInfo.newBuilder("your-bucket-name", fileName)
//                        .setContentType(file.getContentType())
//                        .build(),
//                file.getInputStream());
//
//        // Return the URL of the uploaded file
//        return blobInfo.getMediaLink();
//    }
//}