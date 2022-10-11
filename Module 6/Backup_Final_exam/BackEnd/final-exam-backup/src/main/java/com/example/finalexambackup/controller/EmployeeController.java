package com.example.finalexambackup.controller;

import com.example.finalexambackup.model.Book;
import com.example.finalexambackup.model.Drink;
import com.example.finalexambackup.model.Eat;
import com.example.finalexambackup.service.BookService;
import com.example.finalexambackup.service.CustomerService;
import com.example.finalexambackup.service.DrinkService;
import com.example.finalexambackup.service.EatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController


//Cho phép quyền truy cập vào đường link(origin)
@CrossOrigin("*")
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    CustomerService customerService;

    @Autowired
    BookService bookService;

    @Autowired
    DrinkService drinkService;

    @Autowired
    EatService eatService;

    @Autowired


//    Book
    @GetMapping("/book/list")
    public ResponseEntity<List<Book>> listAllBook() {
        List<Book> books = bookService.findAll();
        if (books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") long id) {
        Book book = bookService.findById(id);
        if (book==null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("/book/create")
    public ResponseEntity<?> createBook(@RequestBody Book book) {
        bookService.save(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping(value = "/book/delete/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Book with id " + id);

        Book book = bookService.findById(id);
        if (book == null) {
            System.out.println("Unable to delete. Book with id " + id + " not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        bookService.remove(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


//    Drink

    @GetMapping("/drink/list/{id}")
    public ResponseEntity<List<Drink>> listAllDrinkByCustomerId(@PathVariable("id") long id) {
        List<Drink> drinks = drinkService.findAllByCustomer_Id(id);
        if (drinks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(drinks, HttpStatus.OK);
    }

    @GetMapping("/drink/list")
    public ResponseEntity<List<Drink>> listAllDrink() {
        List<Drink> drinks = drinkService.findAll();
        if (drinks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(drinks, HttpStatus.OK);
    }

    @GetMapping("/drink/{id}")
    public ResponseEntity<Drink> getDrinkById(@PathVariable("id") long id) {
        Drink drink = drinkService.findById(id);
        if (drink==null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(drink, HttpStatus.OK);
    }

    @PostMapping("/drink/create")
    public ResponseEntity<Void> createDrink(@RequestBody Drink drink) {
        drinkService.save(drink);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping(value = "/drink/delete/{id}")
    public ResponseEntity<Drink> deleteDrink(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Book with id " + id);

        Drink drink = drinkService.findById(id);
        if (drink == null) {
            System.out.println("Unable to delete. Book with id " + id + " not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        bookService.remove(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    Eat

    @GetMapping("/eat/list/{id}")
    public ResponseEntity<List<Eat>> listAllEatByCustomerId(@PathVariable("id") long id) {
        List<Eat> eats = eatService.findAllByCustomer_Id(id);
        if (eats.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(eats, HttpStatus.OK);
    }


    @GetMapping("/eat/list")
    public ResponseEntity<List<Eat>> listAllEat() {
        List<Eat> eats = eatService.findAll();
        if (eats.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(eats, HttpStatus.OK);
    }


    @GetMapping("/eat/{id}")
    public ResponseEntity<Eat> getEatkById(@PathVariable("id") long id) {
        Eat eat = eatService.findById(id);
        if (eat==null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<>(eat, HttpStatus.OK);
    }

    @PostMapping("/eat/create")
    public ResponseEntity<Void> createEat(@RequestBody Eat eat) {
        eatService.save(eat);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping(value = "/eat/delete/{id}")
    public ResponseEntity<Eat> deleteEat(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Eat with id " + id);

        Drink drink = drinkService.findById(id);
        if (drink == null) {
            System.out.println("Unable to delete. Eat with id " + id + " not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        bookService.remove(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
