package com.example.moduleb

import com.example.modulea.Foo
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
public class BModule {
    @Single
    internal fun provideFoobar(): Foo {
        return Bar()
    }
}