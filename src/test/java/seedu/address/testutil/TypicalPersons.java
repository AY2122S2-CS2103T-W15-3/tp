package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GITHUB_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_GITHUB_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TELEGRAM_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TELEGRAM_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withGitHub("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withTelegramHandle("94351253").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withGitHub(null)
            .withEmail("johnd@example.com").withTelegramHandle("98765432").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withTelegramHandle("95352563")
            .withEmail("heinz@example.com").withGitHub("wall street").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withTelegramHandle("87652533")
            .withEmail("cornelia@example.com").withGitHub("10th street").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withTelegramHandle("9482224")
            .withEmail("werner@example.com").withGitHub("michegan ave").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withTelegramHandle("9482427")
            .withEmail("lydia@example.com").withGitHub("little tokyo").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withTelegramHandle("9482442")
            .withEmail("anna@example.com").withGitHub("4th street").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withTelegramHandle("8482424")
            .withEmail("stefan@example.com").withGitHub("little india").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withTelegramHandle("8482131")
            .withEmail("hans@example.com").withGitHub("chicago ave").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withTelegramHandle(VALID_TELEGRAM_AMY)
            .withEmail(VALID_EMAIL_AMY).withGitHub(VALID_GITHUB_AMY).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withTelegramHandle(VALID_TELEGRAM_BOB)
            .withEmail(VALID_EMAIL_BOB).withGitHub(VALID_GITHUB_BOB).build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
