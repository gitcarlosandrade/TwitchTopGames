package marcicand.com.br.topgames.infrastructure.local.entity

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.relation.ToOne

@Entity
class Game {
    @Id(assignable = true) var id: Long = 0
    var giantBombId: Int = -1
    var localizedName: String = ""
    var popularity: Int = -1
    var name: String = ""
    lateinit var logo: ToOne<Logo>
    lateinit var box: ToOne<Box>
    var locale: String = ""
}