package com.becasestudymodule5.repository;

import com.becasestudymodule5.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface IAccountRepo extends CrudRepository<Account,Long> {
}
