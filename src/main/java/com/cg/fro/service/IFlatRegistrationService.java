package com.cg.fro.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;

public interface IFlatRegistrationService {
FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat);

ArrayList<Integer> getAllOwnerIds();
}
