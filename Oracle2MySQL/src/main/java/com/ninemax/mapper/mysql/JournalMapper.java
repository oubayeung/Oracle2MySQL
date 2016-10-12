package com.ninemax.mapper.mysql;

import java.util.List;

import com.ninemax.entity.Journal;

public interface JournalMapper {

	void insertJournal(List<Journal> journals);
}
