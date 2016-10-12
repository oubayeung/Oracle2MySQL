package com.ninemax.mapper.oracle;

import java.util.List;

import com.ninemax.entity.Journal;
public interface JournalDao {

	List<Journal> queryJournal();
}
