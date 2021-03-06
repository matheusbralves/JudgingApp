package tfc2022.judgingapp_21800876.data.athlete

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

//DAO SQL-like functions to handle updates and return athletes list

@Dao
interface AthleteDao {
    @Insert
    suspend fun insert(fire: AthleteRoom)

    @Query("SELECT * FROM athlete")
    suspend fun getAll(): List<AthleteRoom>

    @Query("UPDATE athlete set tricks =:tricks WHERE uuid = :uuid")
    suspend fun updateTricks(uuid: String, tricks : String)

    @Query("UPDATE athlete set score =:score WHERE uuid = :uuid")
    suspend fun updateScore(uuid: String, score : Double)

    @Query("UPDATE athlete set grabs =:grabs WHERE uuid = :uuid")
    suspend fun updateGrabs(uuid: String, grabs : String)

    @Query("UPDATE athlete set execution =:execution WHERE uuid = :uuid")
    suspend fun updateExecution(uuid: String, execution : String)

    @Query("UPDATE athlete set intensity =:intensity WHERE uuid = :uuid")
    suspend fun updateIntensity(uuid: String, intensity : String)

    @Query("UPDATE athlete set composition =:composition WHERE uuid = :uuid")
    suspend fun updateComposition(uuid: String, composition : String)
}