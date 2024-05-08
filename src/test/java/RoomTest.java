import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void testRoomOccupancyAndCleanliness() {
        // Arrange
        Room room = new Room();

        // Act
        room.checkIn();
        room.cleanroom();
        room.checkout();

        // Assert
        assertTrue(room.isOccupied());
        assertFalse(room.isDirty());
    }
}
