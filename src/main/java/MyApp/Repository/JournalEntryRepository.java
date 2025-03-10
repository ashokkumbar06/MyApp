package MyApp.Repository;

import MyApp.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalEntryRepository extends JpaRepository<JournalEntry, ObjectId> {
}
