[![Java CI with Gradle](https://github.com/ablewitt/restdemo/actions/workflows/gradle.yml/badge.svg)](https://github.com/ablewitt/restdemo/actions/workflows/gradle.yml)

# Rest Demo
Toy rest API built on spring boot. 
Server binds to port 8080.

## End points
### `POST /upload` - multi part form data.
>file - any filetype

> comment - text / string

Response - JSON object with file meta and comment

### `GET /greeting?name=XXXX`

Response - JSON object with id and greeting

### `POST /greeting` - text/json body

    {  
       id : number,  
       content : string  
    } 

Response - JSON object with id and greeting



