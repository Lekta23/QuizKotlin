package network.data

import Question

@kotlinx.serialization.Serializable
data class Quiz(var questions: List<Question>)
