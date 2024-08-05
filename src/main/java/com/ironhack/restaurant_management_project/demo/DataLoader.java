package com.ironhack.restaurant_management_project.demo;

import com.ironhack.restaurant_management_project.model.*;
import com.ironhack.restaurant_management_project.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
@Slf4j
public class DataLoader implements CommandLineRunner {

    private final MenuItemRepository menuItemRepository;
    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    private final ReservationRepository reservationRepository;
    private final RestaurantRepository restaurantRepository;

    @Override
    public void run(String... args) throws Exception {
        loadRestaurantData();
        loadMenuItemsData();
        loadCustomersData();
        loadOrdersData();
        loadReservationsData();
    }

    private void loadRestaurantData() {
        Restaurant restaurant = new Restaurant("The Foluks Restaurant", "Schellen Street 5");
        ReservationRepository.save(restaurant);
    }

    private void loadMenuItemsData() {
        Restaurant restaurant = restaurantRepository.findAll().get(0); // Assuming there's at least one restaurant
        List<MenuItem> menuItems = Arrays.asList(
                new MenuItem("Ofada Rice", "Nigeria local Rice And Stew", 10.99, restaurant),
                new MenuItem("Efo Riro", "A mix of pumpkin green leaves", 13.99, restaurant),
                new MenuItem("Akara", "A tasty bean cake", 3.99, restaurant),
                new MenuItem("Fried Rice", "Served with fried plantain", 15.99, restaurant)
        );
        menuItemRepository.saveAll(menuItems);
    }

    private void loadCustomersData() {
        List<Customer> customers = Arrays.asList(
                new Customer("Fortune Smith", "fortune@gmail.com", "123-456-7890", "123 Fortune St"),
                new Customer("Victory Abraham", "victory@gmail.com", "098-765-4321", "456 Victory Ave"),
                new Customer("Anthony Joshua", "anthony@gmail.com", "044-765-4321", "789 Joshua Blvd"),
                new Customer("Clement Osa", "clement@gmail.com", "049-765-4321", "101 Clement Rd"),
                new Customer("Loveth Omoruyi", "loveth@gmail.com", "039-765-4321", "202 Loveth Ln")
        );
        customerRepository.saveAll(customers);
    }

    private void loadOrdersData() {
        List<Order> orders = Arrays.asList(
                new Order(1L, 1L, 2, 19.98, "PENDING"),
                new Order(2L, 2L, 3, 35.97, "PENDING"),
                new Order(3L, 3L, 1, 8.99, "PENDING"),
                new Order(4L, 4L, 1, 6.50, "Delivered")
        );
        orderRepository.saveAll(orders);
    }

    private void loadReservationsData() {
        Optional<Customer> fortuneSmith = customerRepository.findById(1L);
        Optional<Customer> victoryAbraham = customerRepository.findById(2L);
        Optional<Customer> anthonyJoshua = customerRepository.findById(3L);
        Optional<Customer> clementOsa = customerRepository.findById(4L);
        Optional<Customer> lovethOmoruyi = customerRepository.findById(5L);

        if (fortuneSmith.isPresent() && victoryAbraham.isPresent() && anthonyJoshua.isPresent() &&
                clementOsa.isPresent() && lovethOmoruyi.isPresent()) {

            List<Reservation> reservations = Arrays.asList(
                    new Reservation(fortuneSmith.get().getId(), 1, LocalDateTime.now().plusDays(1)),
                    new Reservation(victoryAbraham.get().getId(), 2, LocalDateTime.now().plusDays(2)),
                    new Reservation(anthonyJoshua.get().getId(), 4, LocalDateTime.now().plusDays(3)),
                    new Reservation(clementOsa.get().getId(), 3, LocalDateTime.now().plusDays(4)),
                    new Reservation(lovethOmoruyi.get().getId(), 2, LocalDateTime.now().plusDays(5))
            );
            reservationRepository.saveAll(reservations);
            log.info("Reservations data loaded.");
        } else {
            log.warn("Not all customers found. Reservations data not loaded.");
        }
    }
}

