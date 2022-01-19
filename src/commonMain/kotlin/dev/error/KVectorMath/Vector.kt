package dev.error.KVectorMath

interface Vector {
    val magnitude: Double
    val normalize: Vector
}

// Class Declarations
expect class Vector2
expect class Vector3
expect class Vector4