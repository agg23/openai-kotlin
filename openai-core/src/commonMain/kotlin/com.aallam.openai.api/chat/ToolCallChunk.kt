package com.aallam.openai.api.chat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the tool call chunk.
 */
@Serializable
public data class ToolCallChunk(
    /** Tool call index. **/
    @SerialName("index") val index: Int? = null,
    /** The type of the tool call. **/
    @SerialName("type") val type: String? = null,
    /** The ID of the tool call. **/
    @SerialName("id") val id: ToolId? = null,
    /** The function that the model called. **/
    @SerialName("function") val function: FunctionCall? = null,
)
