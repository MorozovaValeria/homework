package com.task.homework;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @PostMapping("/postdata")
    public ResponseObject handlePostRequest(@RequestBody RequestObject request) {
        // Извлечение данных из запроса
        String extractedData1 = request.getcompanyName();
        String extractedData2 = request.getCandidate();

        // Генерация ответа
        ResponseObject response = new ResponseObject("Уважаемая команда " + extractedData1
                +", спасибо вам за возможность попробовать свои силы в написании заглушки. С уважением, " +extractedData2);

        // Возврат JSON объекта
        return response;
    }

}