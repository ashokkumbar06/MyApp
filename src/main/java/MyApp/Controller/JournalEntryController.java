package MyApp.Controller;

import MyApp.Entity.Apps;
import MyApp.Entity.JournalEntry;
import MyApp.Service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//http://localhost:8080/journal
@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public ResponseEntity<?> getAllJournalEntriesOfUser() {
        return null;
    }

    List<JournalEntry> data = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Apps> createEntry(@RequestBody Apps myEntry) {
        System.out.println("Received: " + myEntry);
        if (myEntry != null) {
            //JournalEntry data = journalEntryService.saveEntry(myEntry);
            System.out.println(myEntry);
            return new ResponseEntity(data, HttpStatus.CREATED);
        } else {
            return new ResponseEntity("Data is empty", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("id/{myId}")
    public ResponseEntity<?> getJournalEntryById(@PathVariable String myId) {
        return null;
    }

    @DeleteMapping("id/{myId}")
    public ResponseEntity<?> deleteJournalEntryById(@PathVariable ObjectId myId) {
        return null;
    }

}