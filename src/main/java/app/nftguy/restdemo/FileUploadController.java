package app.nftguy.restdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*")
@RestController
public class FileUploadController {


    @PostMapping("/file")
    public FileUpload handleFileUpload(@RequestParam(value="file")MultipartFile file,
                                       @RequestParam(value="comment")String comment){
        return new FileUpload(file.getOriginalFilename(), file.getSize(), file.getContentType(), comment);
    }
}
