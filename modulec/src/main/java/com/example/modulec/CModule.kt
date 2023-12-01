package com.example.modulec

import com.example.modulea.Foo
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module

@Module
public class CModule {

    @Factory
    internal fun provideMyFactory(
        foo: Foo
    ): MyFactory {
        return MyFactory(foo)
    }
}