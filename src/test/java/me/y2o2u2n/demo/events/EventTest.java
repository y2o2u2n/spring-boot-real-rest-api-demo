package me.y2o2u2n.demo.events;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EventTest {

    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Spring REST API")
                .description("REST API development with Spring")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {
        // Given
        String name = "Event";
        String description = "Description";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }
}