package kodloma.io.devs.dataAccess.abstracts;

import java.util.List;

import kodloma.io.devs.entities.concretes.ProgrammingLanguages;

public interface IProgrammingLanguagesRepository {
	List<ProgrammingLanguages> getAll();
	void add(ProgrammingLanguages language);
	void delete(ProgrammingLanguages language);
	void update(int id, String newName);
	ProgrammingLanguages getById(int id);

}
