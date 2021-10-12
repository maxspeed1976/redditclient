package com.example.reddit.domain

interface IMapper<Input, Output> {
    open fun map(input: Input?): Output?
}