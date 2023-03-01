package RoomMicroservice.roomMicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class LoadDataRunner implements ApplicationRunner {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Room GroupStudyRoom = new Room();
        GroupStudyRoom.setRoomName("Group Study Room");
        GroupStudyRoom.setCapacity(6);
        GroupStudyRoom.setCost(40);
        GroupStudyRoom.setMaxCoBooker(2);

        roomRepository.save(GroupStudyRoom);
    }
}
