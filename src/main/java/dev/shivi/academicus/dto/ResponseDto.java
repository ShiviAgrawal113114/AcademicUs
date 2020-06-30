package dev.shivi.academicus.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

//this is dto data transfer object feature which is good practice to pass the data as instead of directly pass the
// data it should also contain the useful info like serverid, statuscode etc..
@Getter
@Setter
public class ResponseDto<T> {
    //Generic Class as this class canbe associated with any type of object///

    private HttpStatus statusCode;
    private T data;

    public ResponseDto(HttpStatus httpStatus, T data)
    {
        this.statusCode = httpStatus;
        this.data = data;
    }

}
