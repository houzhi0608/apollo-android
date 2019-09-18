// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_in_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ResponseFieldMarshaller
import com.apollographql.apollo.api.ResponseReader
import kotlin.Array
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter")
data class PlanetFragment(
  val __typename: String,
  /**
   * The name of this planet.
   */
  val name: String?
) : GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller = ResponseFieldMarshaller {
    it.writeString(RESPONSE_FIELDS[0], __typename)
    it.writeString(RESPONSE_FIELDS[1], name)
  }

  companion object {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, true, null)
        )

    val FRAGMENT_DEFINITION: String = """
        |fragment planetFragment on Planet {
        |  __typename
        |  name
        |}
        """.trimMargin()

    val POSSIBLE_TYPES: Array<String> = arrayOf("Planet")

    operator fun invoke(reader: ResponseReader): PlanetFragment {
      val __typename = reader.readString(RESPONSE_FIELDS[0])
      val name = reader.readString(RESPONSE_FIELDS[1])
      return PlanetFragment(
        __typename = __typename,
        name = name
      )
    }
  }
}