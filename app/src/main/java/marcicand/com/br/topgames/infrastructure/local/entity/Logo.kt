package marcicand.com.br.topgames.infrastructure.local.entity

import io.objectbox.annotation.Backlink
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
class Logo{
    @Id var id : Long = 0
    var small: String = ""
    var template: String = ""
    var large: String = ""
    var medium: String = ""

    @Backlink lateinit var games : List<Game>
}