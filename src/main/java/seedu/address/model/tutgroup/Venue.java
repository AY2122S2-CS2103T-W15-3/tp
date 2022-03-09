package seedu.address.model.tutgroup;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Class's Venue
 * Guarantees: immutable; is valid as declared in {@link #isValidVenue(String)}
 */
public class Venue {
    public static final String MESSAGE_CONSTRAINTS =
        "Venue should be alphanumeric and can have hyphens and underscores. It should not be blank.";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "^\\w+(-\\w+)*$";

    public final String venue;

    /**
     * Constructs a {@code Venue}.
     *
     * @param venue A valid venue or null if venue do not exist
     */
    public Venue(String venue) {
        requireNonNull(venue);
        checkArgument(isValidVenue(venue), MESSAGE_CONSTRAINTS);
        this.venue = venue;
    }

    /**
     * Returns true if a given string is a valid venue.
     */
    public static boolean isValidVenue(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return venue;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof Venue // instanceof handles if other is null
            && this.venue.equals(((Venue) other).venue)); // state check
    }

    @Override
    public int hashCode() {
        return venue.hashCode();
    }
}
