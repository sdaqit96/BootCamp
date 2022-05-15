package com.springboot.bankaccounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
@RestController
public class BankAccountController {

    @Autowired
    private bankAccountService accountService;
    public static void main(String[] args) {
        SpringApplication.run(BankAccountController.class, args);
    }

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/accounts")
    public List<BankAccount> accounts() {
        return accountService.getAllAccounts();
    }
//
//  localhost:8081/greeting/1/sdaqit
//	@GetMapping("/greeting/{id}/{name}")
//	public Greeting getSpecificID(@PathVariable long id, @PathVariable String name) {
//		return greetingService.getGreetingWithID(id);
//	}

    /*
    Request Param
    localhost:8081/greeting?id=1&name=Sid
    @GetMapping("/greeting/"
    public Greeting getSpecificID(@RequestParam long id, @RequestParam String name){..}

    @GetMapping("/greeting/{id}/{name}")
    public String greeting(@PathVariable long id, @PathVariable String name){
        return id+" "+name;
    }

    @GetMapping("/greeting/")
    public String greetingParam(@RequestParam long id, @RequestParam String name){
        return id+" "+name;
    }
     */

    @GetMapping("/accounts/{id}")
    public BankAccount getAccountWithId(@PathVariable int id) {
        return accountService.getAccountWithID(id);
    }

    @PostMapping(value = "/addaccount")
    public void addAccount(@RequestBody BankAccount account){
        accountService.addAccount(account);
    }
    //localhost:8081/deposit/?id=1&amount=300
    @PutMapping(value = "/deposit/")
    public String depositBalance(@RequestParam int id, @RequestParam double amount ){
        boolean success = accountService.addBalance(id, amount);
        if(success){
            return "Successfully Funds Added";
        }
        else{
            return "Fund deposit Failed";
        }
    }

    @PutMapping(value = "/withdraw/")
    public String withdrawBalance(@RequestParam int id, @RequestParam double amount ){
        boolean success = accountService.withdrawBalance(id, amount);
        if(success){
            return "Successfully Funds Withdrawn";
        }
        else{
            return "Fund withdrawn Failed";
        }
    }

    @PutMapping(value = "/transfer/")
    public String transferBalance(@RequestParam int id, @RequestParam double amount ){
        boolean success = accountService.transferBalance(id, amount);
        if(success){
            return "Successfully Funds Transferred";
        }
        else{
            return "Fund Transferred Failed";
        }
    }

    @DeleteMapping(value = "/delete/")
    public void deleteGreeting(@RequestParam int id){
        accountService.deleteAccount(id);
    }
}