package com.example.scope;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
class SingletonBean {
}

@Component
@Scope("prototype")
class PrototypeBean {
}

@Component
@Lazy
class LazyBean {
}

@Component
@Lazy(false)
class EagerBean {
}
