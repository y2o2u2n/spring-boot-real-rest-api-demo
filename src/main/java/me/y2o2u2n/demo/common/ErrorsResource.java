package me.y2o2u2n.demo.common;

import me.y2o2u2n.demo.index.IndexController;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.validation.Errors;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

public class ErrorsResource extends Resource<Errors> {

    public ErrorsResource(Errors errors, Link... links) {
        super(errors, links);
        add(linkTo(methodOn(IndexController.class).index()).withRel("index"));
    }
}
