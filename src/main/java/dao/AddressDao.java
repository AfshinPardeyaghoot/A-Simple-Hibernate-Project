package dao;

import entites.Address;

import javax.persistence.EntityManager;

public class AddressDao extends AbstractEntityDao<Address,Integer> {
    public AddressDao(EntityManager entityManager) {
        super(entityManager);
    }

    public Class<Address> getClassType() {
        return Address.class;
    }
}
