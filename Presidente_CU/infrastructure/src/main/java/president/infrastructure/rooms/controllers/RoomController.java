package president.infrastructure.rooms.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import president.application.usecase.room.create.CreateRoomIn;
import president.application.usecase.room.create.CreateRoomOut;
import president.application.usecase.room.create.CreateRoomUseCaseImpl;
import president.application.usecase.room.retrieve.by.id.RetrieveRoomByIdOut;
import president.application.usecase.room.retrieve.by.id.RetrieveRoomByIdUseCaseImpl;
import president.domain.objetos_de_valor.identificador.ID_da_Sala;
import president.infrastructure.rooms.repository.RoomInMemoryRepository;

@RestController
public class RoomController {

    @PostMapping("rooms")
    @ResponseStatus(HttpStatus.CREATED)
    CreateRoomOut createRoom(@RequestBody CreateRoomIn anIn) {

        final CreateRoomUseCaseImpl useCase = new CreateRoomUseCaseImpl(
                new RoomInMemoryRepository()
        );

        return useCase.execute(anIn);

    }

    @GetMapping("rooms/{roomId}")
    RetrieveRoomByIdOut retrieveRoomById(@PathVariable String roomId) {

        final RetrieveRoomByIdUseCaseImpl useCase = new RetrieveRoomByIdUseCaseImpl(
                new RoomInMemoryRepository()
        );

        return useCase.execute(ID_da_Sala.of());

    }

}
