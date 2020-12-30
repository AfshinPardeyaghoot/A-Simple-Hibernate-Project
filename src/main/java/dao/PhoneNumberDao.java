package dao;

import entites.PhoneNumber;

import javax.persistence.EntityManager;

public class PhoneNumberDao extends AbstractEntityDao<PhoneNumber,Integer> {
    public PhoneNumberDao(EntityManager entityManager) {
        super(entityManager);
    }

    public Class<PhoneNumber> getClassType() {
        return PhoneNumber.class;
    }
}
