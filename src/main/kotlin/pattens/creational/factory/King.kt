package pattens.creational.factory

data class King(
    override val file: Char,
    override val rank: Char
) : ChessPiece