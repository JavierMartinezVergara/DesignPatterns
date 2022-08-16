package pattens.creational.factory

object CheesePieceImpl {

    fun createPiece(notation: String) : ChessPiece{
        val (type, file, rank) = notation.toCharArray()

        return when(type){
            'q' -> Queen(file, rank)
            'p' -> Pawn(file, rank)

            else -> throw RuntimeException("Unknown piece: $type")
        }
    }
}