package de.djetzen.yeartime.adapter.out.persistence.repository

import de.djetzen.yeartime.domain.DayEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
interface DayRepository : CrudRepository<DayEntity, Long> {
    fun findDayByDateOfDayAndUserName(dateOfDay: LocalDate, userName: String): DayEntity?
}