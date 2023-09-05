package com.techchallenges.faseDois.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techchallenges.faseDois.dtos.AddressDTO;
import com.techchallenges.faseDois.dtos.AddressFilterDTO;
import com.techchallenges.faseDois.mappers.AddressMapper;
import com.techchallenges.faseDois.models.Address;
import com.techchallenges.faseDois.repositories.AddressDAO;

import jakarta.persistence.NoResultException;

@Service
public class AddressService implements BaseService<AddressDTO> {

    @Autowired
    AddressDAO addressDAO;

    @Autowired
    AddressMapper addressMapper;

    public AddressDTO save(AddressDTO addressDTO) {
        return addressMapper.toDto(addressDAO.save(addressMapper.toEntity(addressDTO)));
    }

    public List<AddressDTO> getAll() {
        return addressMapper.toDto(addressDAO.findAll());
    }

    public List<AddressDTO> filter(AddressFilterDTO filter) {
        return addressMapper.toDto(addressDAO.filter(filter));
    }

    public AddressDTO getById(UUID id) {
        checkIfExists(id);
        Optional<Address> address = addressDAO.findById(id);
        return addressMapper.toDto(address.get());
    }

    public void delete(UUID id) {
        checkIfExists(id);
        addressDAO.deleteById(id);
    }

    public AddressDTO update(AddressDTO addressDTO) {
        checkIfExists(addressDTO.getId());
        var updatedAddress = addressDAO.save(addressMapper.toEntity(addressDTO));
        return addressMapper.toDto(updatedAddress);
    }

    private void checkIfExists(UUID id) {
        if (!addressDAO.existsById(id)) {
            throw new NoResultException("This address was not found");
        }
    }

}
