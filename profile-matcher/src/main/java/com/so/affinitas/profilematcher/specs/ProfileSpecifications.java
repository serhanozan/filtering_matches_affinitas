package com.so.affinitas.profilematcher.specs;

import java.math.BigDecimal;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.so.affinitas.profilematcher.entity.Profile;

public class ProfileSpecifications {

	public static Specification<Profile> profileByPhoto(final Boolean hasPhoto) {
		return new Specification<Profile>() {
			@Override
			public Predicate toPredicate(Root<Profile> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				if(hasPhoto) {
					return cb.isNotNull(root.<Boolean> get("mainPhoto"));
				}else {
					return cb.isNull(root.<Boolean> get("mainPhoto"));
				}
			}
		};
	}
	
	public static Specification<Profile> profileByInContact(final Boolean isInContact) {
		return new Specification<Profile>() {
			@Override
			public Predicate toPredicate(Root<Profile> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				if(isInContact) {
					return cb.greaterThan(root.<Integer> get("contactsExchanged"), 0);
				}else {
					return cb.equal(root.<Integer> get("contactsExchanged"), 0 );
				}
			}
		};
	}

	public static Specification<Profile> profileByFavourite(final Boolean isFavourite) {
		return new Specification<Profile>() {
			@Override
			public Predicate toPredicate(Root<Profile> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.equal(root.<Boolean> get("favourite"), isFavourite);
			}
		};
	}
	
	public static Specification<Profile> profileByCompatibilityScore(final BigDecimal minScore, final BigDecimal maxScore) {
		return new Specification<Profile>() {
			@Override
			public Predicate toPredicate(Root<Profile> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.between(root.<BigDecimal> get("compatibilityScore"), minScore, maxScore);
			}
		};
	}
	
	public static Specification<Profile> profileByAge(final Integer minAge, final Integer maxAge) {
		return new Specification<Profile>() {
			@Override
			public Predicate toPredicate(Root<Profile> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.between(root.<Integer> get("age"), minAge, maxAge);
			}
		};
	}
	
	public static Specification<Profile> profileByHeight(final Integer minHeight, final Integer maxHeight) {
		return new Specification<Profile>() {
			@Override
			public Predicate toPredicate(Root<Profile> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.between(root.<Integer> get("heightInCm"), minHeight, maxHeight);
			}
		};
	}
}
