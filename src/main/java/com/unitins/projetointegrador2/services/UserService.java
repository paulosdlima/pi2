package com.unitins.projetointegrador2.services;

import com.unitins.projetointegrador2.models.Pessoa;

import java.util.Optional;

public interface UserService {
    public Optional<Pessoa> findUserByEmail(String email);

    public Optional<Pessoa> findUserByResetToken(String resetToken);

    public void saveUser(Pessoa user);
}