package MyApp.Controller;

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

    List<JournalEntry> data = new ArrayList<>();
    @Autowired
    private JournalEntryService journalEntryService;

    @PostMapping
    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry myEntry) {
        if (myEntry != null) {
            JournalEntry data = journalEntryService.saveEntry(myEntry);
            return new ResponseEntity(data, HttpStatus.CREATED);
        } else {
            return new ResponseEntity("Data is empty", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<JournalEntry>> getAllJournalEntry() {
        List<JournalEntry> alldata = journalEntryService.getAllJournalEntry();
        return new ResponseEntity<>(alldata, HttpStatus.CREATED);
    }

    @GetMapping("id/{myId}")
    public ResponseEntity<?> getJournalEntryById(@PathVariable String myId) {
        return null;
    }

    @DeleteMapping("id/{myId}")
    public ResponseEntity<?> deleteJournalEntryById(@PathVariable ObjectId myId) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<String> deleteJournalEntryById() {
        String response = journalEntryService.deleteJournalEntry();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}