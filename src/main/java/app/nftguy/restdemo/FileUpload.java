package app.nftguy.restdemo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class FileUpload {
    @NonNull String fileName;
    @NonNull Long fileSize; // bytes
    @NonNull String fileType;
    @NonNull String comment;
}
