package com.example.restController_pathVariable_requestBody;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/api")
public class RestApiController {

    private List<Todo> todoList = new CopyOnWriteArrayList<>();

    @PostConstruct
    public void init(){
        // Thêm null vào list để bỏ qua vị trí số 0
        todoList.add(null);
    }

    @GetMapping("/todo")
    public List<Todo> getTodoList() {
        return todoList;
    }

    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") long todoId){
        // @PathVariable lấy ra thông tin trong URL
        // dựa vào tên của thuộc tính đã định nghĩa trong ngoặc kép /todo/{todoId}
        return todoList.get((int) todoId);
    }

    //@RequestBody nói với Spring Boot rằng hãy chuyển Json trong request body thành đối tượng Todo

    @PutMapping("/todo/{todoId}")
    public Todo editTodo(@PathVariable(name = "todoId") Integer todoId,
                        @RequestBody Todo todo){
        todoList.set(todoId, todo);

        return todo;
    }

    @DeleteMapping("/todo/{todoId}")
    public ResponseEntity deleteTodo(@PathVariable(name = "todoId") Integer todoId){
        todoList.remove(todoId.intValue());
        return ResponseEntity.ok().body("Delete successfully");
    }

    @PostMapping("/todo")
    public ResponseEntity addTodo(@RequestBody Todo todo){
        todoList.add(todo);
        // Trả về response với STATUS CODE = 200 (OK)
        // Body sẽ chứa thông tin về đối tượng todo vừa được tạo.
        return ResponseEntity.ok().body(todo);
    }
}
