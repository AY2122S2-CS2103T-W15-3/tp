package seedu.address.testutil;

import seedu.address.model.person.Email;
import seedu.address.model.person.GitHub;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Telegram;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_TELEGRAM = "amy85355255";
    public static final String DEFAULT_EMAIL = "amy@gmail.com";
    public static final String DEFAULT_GITHUB = "AmyBeeisMe";

    private Name name;
    private Telegram telegram;
    private Email email;
    private GitHub gitHub;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(DEFAULT_NAME);
        telegram = new Telegram(DEFAULT_TELEGRAM);
        email = new Email(DEFAULT_EMAIL);
        gitHub = new GitHub(DEFAULT_GITHUB);
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        name = personToCopy.getName();
        telegram = personToCopy.getTelegram().orElse(null);
        email = personToCopy.getEmail();
        gitHub = personToCopy.getGitHub().orElse(null);
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Sets the {@code GitHub} of the {@code Person} that we are building.
     */
    public PersonBuilder withGitHub(String gitHub) {
        if (gitHub == null) {
            this.gitHub = null;
        } else {
            this.gitHub = new GitHub(gitHub);
        }
        return this;
    }

    /**
     * Sets the {@code Telegram} of the {@code Person} that we are building.
     */
    public PersonBuilder withTelegram(String teleHandle) {
        if (teleHandle == null) {
            this.telegram = null;
        } else {
            this.telegram = new Telegram(teleHandle);
        }
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Person} that we are building.
     */
    public PersonBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    public Person build() {
        return new Person(name, telegram, email, gitHub);
    }

}
