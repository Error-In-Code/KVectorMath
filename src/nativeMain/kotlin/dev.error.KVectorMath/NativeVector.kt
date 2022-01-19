package dev.error.KVectorMath

import kotlin.math.sqrt

// Class declarations
actual data class Vector2 (var x: Double, var y: Double) : Vector {
    override val magnitude: Double
        get() = sqrt((this.x * this.x) + (this.y * this.y))
    override val normalize: Vector
        get() = this / this.magnitude
}

actual data class Vector3 (var x: Double, var y: Double, var z: Double) : Vector {
    override val magnitude: Double
        get() = sqrt((this.x * this.x) + (this.y * this.y) + (this.z + this.z))
    override val normalize: Vector
        get() = this / this.magnitude
}

actual data class Vector4 (var x: Double, var y: Double, var z: Double, var w: Double) : Vector {
    override val magnitude: Double
        get() = sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z) + (this.w * this.w))
    override val normalize: Vector
        get() = this / this.magnitude
}


/* -----Vector2 Operators----- */

// Unary
operator fun Vector2.unaryMinus(): Vector2 = Vector2(-this.x, -this.y)
operator fun Vector2.unaryPlus(): Vector2 = this
//Arithmetic
operator fun Vector2.plus(other: Vector2): Vector2 = Vector2(this.x + other.x, this.y + other.y)
operator fun Vector2.minus(other: Vector2): Vector2 = Vector2(this.x - other.x, this.y - other.y)
operator fun Vector2.times(other: Vector2): Vector2 = Vector2(this.x * other.x, this.y * other.y)
operator fun Vector2.times(other: Double): Vector2 = Vector2(this.x * other, this.y * other)
operator fun Vector2.div(other: Vector2): Vector2 = Vector2(this.x / other.x, this.y / other.y)
operator fun Vector2.div(other: Double): Vector2 = Vector2(this.x / other, this.y / other)

/* -----Vector3 Operators----- */

// Unary
operator fun Vector3.unaryMinus(): Vector3 = Vector3(-this.x, -this.y, -this.z)
operator fun Vector3.unaryPlus(): Vector3 = this
// Arithmetic
operator fun Vector3.plus(other: Vector3): Vector3 = Vector3(this.x + other.x, this.y + other.y, this.z + other.z)
operator fun Vector3.minus(other: Vector3): Vector3 = Vector3(this.x - other.x, this.y - other.y, this.z - other.z)
operator fun Vector3.times(other: Vector3): Vector3 = Vector3(this.x * other.x, this.y * other.y, this.z * other.z)
operator fun Vector3.times(other: Double): Vector3 = Vector3(this.x * other, this.y * other, this.z * other)
operator fun Vector3.div(other: Vector3): Vector3 = Vector3(this.x / other.x, this.y / other.y, this.z / other.z)
operator fun Vector3.div(other: Double): Vector3 = Vector3(this.x / other, this.y / other, this.z / other)

/* -----Vector4 Operators----- */

// Unary
operator fun Vector4.unaryMinus(): Vector4 = Vector4(-this.x, -this.y, -this.z, -this.w)
operator fun Vector4.unaryPlus(): Vector4 = this

// Arithmetic
operator fun Vector4.plus(other: Vector4): Vector4 = Vector4(this.x + other.x, this.y + other.y, this.z + other.z, this.w + other.w)
operator fun Vector4.minus(other: Vector4): Vector4 = Vector4(this.x - other.x, this.y - other.y, this.z - other.z, this.w - other.w)
operator fun Vector4.times(other: Vector4): Vector4 = Vector4(this.x * other.x, this.y * other.y, this.z * other.z, this.w * other.w)
operator fun Vector4.times(other: Double): Vector4 = Vector4(this.x * other, this.y * other, this.z * other, this.w * other)
operator fun Vector4.div(other: Vector4): Vector4 = Vector4(this.x / other.x, this.y / other.y, this.z / other.z, this.w * other.w)
operator fun Vector4.div(other: Double): Vector4 = Vector4(this.x / other, this.y / other, this.z / other, this.w * other)