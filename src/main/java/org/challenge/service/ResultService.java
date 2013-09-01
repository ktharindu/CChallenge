package org.challenge.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.challenge.model.Result;
import org.challenge.repository.SchoolRepository;
import org.challenge.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

	@Autowired
	private ResultRepository resultRepository;

	@Autowired
	private SchoolRepository schoolRepository;

	public Result read(Result result) {
		return result;
	}

	public List<Result> readAll() {
		return resultRepository.findAll();
	}

	public List<Result> readBySubject(String subject, String sortBy,
			String orderBy) {
		List<Result> results = resultRepository.findBySubject(subject);
		return sortResults(results, sortBy, orderBy);
	}

	public List<Result> sortResults(List<Result> results, String sortBy,
			String orderBy) {

		if ((!sortBy.equals("")) && (!orderBy.equals(""))) {
			if (sortBy.equals("school")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortBySchool());
				} else {
					Collections.sort(results,
							Collections.reverseOrder(new SortBySchool()));
				}
			} else if (sortBy.equals("y3")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortByLatestY3());
				} else {
					Collections.sort(results,
							Collections.reverseOrder(new SortByLatestY3()));
				}
			} else if (sortBy.equals("y5")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortByLatestY5());
				} else {
					Collections.sort(results,
							Collections.reverseOrder(new SortByLatestY5()));
				}
			} else if (sortBy.equals("y7")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortByLatestY7());
				} else {
					Collections.sort(results,
							Collections.reverseOrder(new SortByLatestY7()));
				}
			} else if (sortBy.equals("y9")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortByLatestY9());
				} else {
					Collections.sort(results,
							Collections.reverseOrder(new SortByLatestY9()));
				}
			} else if (sortBy.equals("rgy3y5")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortByRawGainY3Y5());
				} else {
					Collections.sort(results,
							Collections.reverseOrder(new SortByRawGainY3Y5()));
				}
			} else if (sortBy.equals("fgy3y5")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortByFactoredGainY3Y5());
				} else {
					Collections.sort(results, Collections
							.reverseOrder(new SortByFactoredGainY3Y5()));
				}
			} else if (sortBy.equals("cy3ty5")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortByGlgY3Y5());
				} else {
					Collections.sort(results,
							Collections.reverseOrder(new SortByGlgY3Y5()));
				}
			} else if (sortBy.equals("gigy3toy5")) {
				if (orderBy.equals("A")) {
					Collections.sort(results, new SortByLatestGainInGainY3Y5());
				} else {
					Collections.sort(results, Collections
							.reverseOrder(new SortByLatestGainInGainY3Y5()));
				}
			}

		}
		return results;
	}

	// Sorting Comparator classes...
	class SortBySchool implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getSchool().getSchoolName()
					.compareTo(r2.getSchool().getSchoolName());
		}
	}

	class SortByLatestY3 implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getLatestY3().compareTo(r2.getLatestY3());
		}
	}

	class SortByLatestY5 implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getLatestY5().compareTo(r2.getLatestY5());
		}
	}

	class SortByLatestY7 implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getLatestY7().compareTo(r2.getLatestY7());
		}
	}

	class SortByLatestY9 implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getLatestY9().compareTo(r2.getLatestY9());
		}
	}

	class SortByRawGainY3Y5 implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getRawGainY3Y5().compareTo(r2.getRawGainY3Y5());
		}
	}

	class SortByFactoredGainY3Y5 implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getFactoredGainY3Y5().compareTo(r2.getFactoredGainY3Y5());
		}
	}

	class SortByGlgY3Y5 implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getGlgY3Y5().compareTo(r2.getGlgY3Y5());
		}
	}

	class SortByLatestGainInGainY3Y5 implements Comparator<Result> {
		public int compare(Result r1, Result r2) {
			return r1.getLatestGainInGainY3Y5().compareTo(
					r2.getLatestGainInGainY3Y5());
		}
	}
}
