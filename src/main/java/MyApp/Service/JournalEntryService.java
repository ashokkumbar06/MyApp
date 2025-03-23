package MyApp.Service;

import MyApp.Entity.JournalEntry;
import MyApp.Repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public JournalEntry saveEntry(JournalEntry journalEntry) {
        return journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAllJournalEntry() {
        return journalEntryRepository.findAll();
    }

    public List<JournalEntry> getAll() {
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id) {
        return journalEntryRepository.findById(id);
    }

    public String deleteJournalEntry() {
        List<JournalEntry> data = journalEntryRepository.findAll();
        if (!data.isEmpty()) {
            journalEntryRepository.deleteAll();
            return "All doc are cleared now !";
        }
        return "file are empty currently there is now data is present in ur Db !";
    }
}